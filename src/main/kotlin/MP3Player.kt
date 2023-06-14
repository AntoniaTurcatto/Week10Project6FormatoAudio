class MP3Player:FormatoAudio {

    override fun play(audio: String) {
        println("Tocando $audio no MP3Player")
    }

    override fun pause() {
        println("Pausando audio no MP3Player")
    }

    override fun stop() {
        println("Parando áudio no MP3Player")
    }

}