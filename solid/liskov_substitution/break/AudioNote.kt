class AudioNote(title: String, description: String, file: File, val transcription: String) 
    : Note(title, description, file)  {
    
    override fune play() {
        super.play()
        //add extra job like put audio transcription into view
    }
}