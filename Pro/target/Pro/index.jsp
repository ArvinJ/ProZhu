<html>
<body style ="padding-top: 0px;padding-left: 0px;margin-left: 0px;margin-top: 0px">
	<div id="display_background"
		style="position: absolute; z-index: 1001; height: 100%; width: 100%;">
		<canvas id="my_canvas" style="height: 100%; width: 100%;"></canvas>
	</div>
</body>
<script type="text/javascript">
	var c = document.getElementById("my_canvas");
	var ctx = c.getContext("2d");

	c.height = window.innerHeight;
	c.width = window.innerWidth;
	var txts = "01";
	txts = txts.split("");

	var font_size = 16;
	var columns = c.width / font_size;
	var drops = [];
	for (var x = 0; x < columns; x++) {
		drops[x] = 1;
	}

	function draw() {
		ctx.fillStyle = "rgba(0, 0, 0, 0.05)";
		ctx.fillRect(0, 0, c.width, c.height);

		ctx.fillStyle = "#0F0"; //green text
		ctx.font = font_size + "px arial";
		for (var i = 0; i < drops.length; i++) {
			var text = txts[Math.floor(Math.random() * txts.length)];
			ctx.fillText(text, i * font_size, drops[i] * font_size);
			if (drops[i] * font_size > c.height || Math.random() > 0.95)
				drops[i] = 0;

			drops[i]++;
		}
	}
	setInterval(draw, 33);
	//draw();
</script>


</body>
</html>