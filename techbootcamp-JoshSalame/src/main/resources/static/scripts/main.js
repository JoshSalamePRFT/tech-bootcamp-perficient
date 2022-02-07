document.getElementsById("submit").onclick = printSudokuBoard();

function printSudokuBoard() {
	var toPrint = "You inputted the following board: ";
	document.getElementById("input-display").innerHTML = toPrint;
	var input = document.getElementsByClassName("array");
	for (var i = 0; i < input.length; i++) {
		//for (var j = 0; j < 9; j++) {
			var element = input[i];
			toPrint = toPrint + element + " ";
		//}
		toPrint = toPrint + "\n";
	}
	
	//document.getElementById("input-display").innerHTML = toPrint;
}