class AudioNote(title: String, description: String, file: File, val transcription: String) 
    : MediaNote(title, description, file)  {
    
    override fune play() {
        super.play()
        //add extra job like put audio transcription into view
    }
}