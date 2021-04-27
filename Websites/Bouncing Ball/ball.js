var context;
var dx = 4;
var dy = 4;
var y = 150;
var x = 10;

function draw() {
    context = myCanvas.getContext('2d');
    context.clearRect(0, 0, 700, 500);
    context.beginPath();
    context.fillStyle = "#ffae00";
    context.arc(x, y, 20, 0, Math.PI * 2, true);
    context.closePath();
    context.fill();
    if (x < 0 || x > 700)
        dx = -dx;
    if (y < 0 || y > 500)
        dy = -dy;
    x += dx;
    y += dy;
}
setInterval(draw, 10);