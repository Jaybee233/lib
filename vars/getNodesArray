def SingelChoise(listString) {
    //Plugin extensible-choice-parameter
    input message: '', parameters: [[$class: 'ExtensibleChoiceParameterDefinition', choiceListProvider: [$class: 'TextareaChoiceListProvider', addEditedValue: false, choiceListText: "${listString}"], description: '', editable: false, name: 'activevalue']]
}

def InputChoiseNodesByLabel(labelname) {
    def nodes = nodesByLabel(label: labelname , offline: true)
    def node_lenth = nodes.size()
    def init = 0
    def listString = ""
    while(init != node_lenth) {
        //println nodes[init]
        listString = listString.concat(nodes[init] + "\n")
        //println listString
        init ++
    }
    println listString
    SingelChoise(listString)
}

def MyChoise = InputChoiseNodesByLabel('Linux')
echo MyChoise
