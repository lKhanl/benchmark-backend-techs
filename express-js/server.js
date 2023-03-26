const express = require("express");
const cors = require("cors");

const app = express();

var corsOptions = {
  origin: "http://localhost:8081",
};

app.use(cors(corsOptions))

app.use(express.json());

app.use(express.urlencoded({ extended: true }));


app.get('/', (req, res) => {
    let startTime = performance.now()
    let value = 1;
    for(var i = 1; i < 1000; i++){
        value+=i
    }
    let endTime = performance.now()
    const time = endTime - startTime
    return res.status(200).send({
      result: value,
      tech: "Express.js",
      time: time
    })
})

const PORT = process.env.PORT || 8080;
app.listen(PORT, () => {
  console.log(`Server is running on port ${PORT}.`);
});
