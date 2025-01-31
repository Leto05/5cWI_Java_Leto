const express = require("express")
const bodyParser = require('body-parser');


const app = express();
const port = 3010;
app.use(bodyParser.urlencoded({ extended: false }));
app.use(bodyParser.json());

const data =
    [
        { name: "Hans", age: 18 },
        { name: "William", age: 20 },
        { name: "Flo", age: 19 },
        { name: "Danielus", age: 18 },
        { name: "Leto", age: 19 },
    ]

app.get("/people", (req, res) => {
    res.send(data);
});

app.get("/people/:id", (req, res) => {
    let id = req.params.id;
    res.send(data[id]);
});

app.delete("/people/:id", (req, res) => {
    let id = req.params.id;
    data.splice(id, 1);
    res.send("done");
});

app.post("/people", (req, res) => {
    data.push(req.body);
    res.send(req.body);
});

app.listen(port, () => console.log(`Hello world app listening on port ${port}!`))