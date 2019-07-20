class VideoNote(title: String, description: String, file: File, val subtitles: File) 
    : MediaNote(title, description, file)  {
    
    override fun play() {
        //load subtitles file
        super.play()
        //add extra job like combine video with subtitles
    }
}
