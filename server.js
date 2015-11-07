var express = require('express'),
    app = express(),
    multer = require('multer'),
    upload = multer({dest: 'uploads/'}),
    port = process.env.PORT || 8080;

app.get('/', function(req, res) {
    res.sendFile("index.html", {root: "www/"}); 
});
app.post('/upload', upload.single('avatar'), function(req, res) {
    console.log(req.body);
    console.log(req.file);
    res.status(204).end();
})
app.listen("8080");
