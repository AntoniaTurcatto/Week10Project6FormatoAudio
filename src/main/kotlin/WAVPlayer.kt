class WAVPlayer:FormatoAudio {

    override fun play(audio: String) {
        println("Tocando $audio no WAVPlayer")
    }

    override fun pause() {
        println("Pausando audio no WAVPlayer")
    }

    override fun stop() {
        println("Parando áudio no WAVPlayer")
    }

}