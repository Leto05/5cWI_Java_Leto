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

app.get("/peeople", (req, res) => {
    res.send(data);
})

app.listen(port, () => console.log(`Hello world app listening on port ${port}!`))