class NotesView() {

    val notes = mutableListOf<Note>()

    fun init() {
        notes.add(AudioNote("audio", "description", File("audio.mp3"), "transcription"))
        notes.add(VideoNote("video", "description", File("video.mp4"), File("subtitles.txt")))
        notes.add(TextNote("text", "description", "content"))
    }

    fun playNote(index: Int) {
        notes(index).play()
        //this class know nothing about Note class implementations
        //for TextNote there will be problem
    }

    //more methods
}