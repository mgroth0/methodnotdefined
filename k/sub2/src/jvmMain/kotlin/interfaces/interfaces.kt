package interfaces



interface DoubleWrapper<M : DoubleWrapper<M>> {

    fun fromDouble(d: Double): M
    val asDouble: Double

    operator fun minus(m: M): M {
        return fromDouble(asDouble - m.asDouble)
    }


}

