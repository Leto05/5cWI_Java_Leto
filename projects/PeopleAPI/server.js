const express = require("express")


const app = express();
const port = 3010;


app.get("/", (req, res) => {
    res.send("I am here");
})

app.listen(port, () => console.log(`Hello world app listening on port ${port}!`))