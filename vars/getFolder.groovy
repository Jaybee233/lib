def getFolder() {
    def FolderName = JOB_NAME.split('/');
    return FolderName[0];
}
println getFolder()
 
