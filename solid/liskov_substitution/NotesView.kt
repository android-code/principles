class NotesView() {

    val notes = mutableListOf<MediaNote>()

    fun init() {
        notes.add(AudioNote("audio", "description", File("audio.mp3"), "transcription"))
        notes.add(VideoNote("video", "description", File("video.mp4"), File("subtitles.txt")))
    }

    fun playNote(index: Int) {
        notes(index).play()
    }
}