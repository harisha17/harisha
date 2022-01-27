function validate() {
    if (document.myform.name.value == "") {
        alert("Please provide your name!");
        document.myform.name.focus();
        return false;
    }
    else if (document.myform.taskid.value == "") {
        alert("Please provide your taskid!");
        document.myform.taskid.focus();
        return false;
    }
    else if (document.myform.description.value == "") {
        alert("Please provide your description!");
        document.myform.description.focus();
        return false;
    }
    else if (document.myform.status.value == "") {
        alert("Please select your current status!");
        document.myform.status.focus();
        return false;
    }
    else if (document.myform.priority.value == "") {
        alert("Please select your current priority!");
        document.myform.priority.focus();
        return false;
    }
    else if (document.myform.notes.value == "") {
        alert("Please provide your note!");
        document.myform.notes.focus();
        return false;
    }
    else if (document.myform.bookmark.value == "") {
        alert("Please provide your bookmark!");
        document.myform.bookmark.focus();
        return false;
    }
    else if (document.myform.ownerid.value == "") {
        alert("Please enter your ownerid!");
        document.myform.ownerid.focus();
        return false;
    }
    else if (document.myform.createrid.value == "") {
        alert("Please enter your createrid!");
        document.myform.createrid.focus();
        return false;
    }
    else if (document.myform.createdon.value == "") {
        alert("Please provide your createdon date!");
        document.myform.createdon.focus();
        return false;
    }
    else if (document.myform.modifiedon.value == "") {
        alert("Please provide your modifiedon date!");
        document.myform.modifiedon.focus();
        return false;
    }
}