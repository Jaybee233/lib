//echo "input value:${Active_Nodes}"
def getListByString(inputString) {
    str = inputString.split(',');
    return str
}

if(Active_Nodes) {
    println getListByString(Active_Nodes).size()
}
else {
    echo "input value:${Active_Nodes}"
    error 'Error message'
}


echo "this is finall"
