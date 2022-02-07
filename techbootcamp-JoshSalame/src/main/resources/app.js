function addSudokuContent(){
    var content = [ { "row_value": document.getElementById("row_value").value },
				    { "column_value": document.getElementById("row_value").value },
				    { "startValue": document.getElementById("row_value").value },
				    { "solvedValue": document.getElementById("row_value").value },
				    { "sudoku_id": document.getElementById("sudoku_id").value }];
    
    $.ajax({
	    type: "POST",
	    url: "http://localhost:8080/sudoku-content/",
	    data: JSON.stringify({ Content: content }),
	    contentType: "application/json; charset=utf-8",
	    //dataType: "json",
	    success: function(data){alert(data);},
	    error: function(errMsg) {
	        alert(errMsg);
	    }
	});
}

function addSudokuMetaData() {
	console.log("Entered app.js addSudokuMetaData");
	var metaData = [ { "puzzleName": document.getElementById("puzzleName").value },
				    { "creator": document.getElementById("creator").value },
				    { "puzzleRules": document.getElementById("puzzleRules").value },
				    { "username": document.getElementById("username").value },
				    { "completionTime": document.getElementById("completionTime").value }];
    
    $.ajax({
	    type: "POST",
	    url: "http://localhost:8080/sudoku-content/",
	    data: JSON.stringify({ MetaData: metaData }),
	    contentType: "application/json; charset=utf-8",
	    //dataType: "json",
	    success: function(data){alert(data);},
	    error: function(errMsg) {
	        alert(errMsg);
	    }
	});
}

$.get("http://localhost:8080/sudoku-content/get/all", function(data){
    //console.log(data)
    data.forEach(element => {
        let table = "<tr><td>" + element.name + "</td></tr>";
        document.getElementById("sudokuContentTable").innerHTML += table;
    });
})

$.get("http://localhost:8080/sudoku-metadata/get/all", function(data){
    let selectElement = document.getElementById("movieStudio");
    data.forEach(element => {
        selectElement.add(new Option(element.name, element.name));
    })
})

$.get("http://localhost:8080/sudoku-content/get/all", function(data){
    data.forEach(element => {
        let table = "<tr><td>" + element.row_value + "</td>" +
        "<td>" + element.column_value + "</td>" +
        "<td>" + element.startValue + "</td>" +
        "<td>" + element.solvedValue + "</td>" +
        "<td>" + element.sudoku_id + "</td></tr>";
        //console.log(element);
        document.getElementById("sudokuContentTable").innerHTML += table;
    });
})

$.get("http://localhost:8080/sudoku-metadata/get/all", function(data){
    data.forEach(element => {
        let table = "<tr><td>" + element.puzzleName + "</td>" +
        "<td>" + element.creator + "</td>" +
        "<td>" + element.puzzleRules + "</td>" +
        "<td>" + element.username + "</td>" +
        "<td>" + element.completionTime + "</td></tr>";
        //console.log(element);
        document.getElementById("sudokuMetaDataTable").innerHTML += table;
    });
})