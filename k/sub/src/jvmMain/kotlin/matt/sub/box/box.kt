package matt.sub.box

import interfaces.DoubleWrapper


@JvmInline
value class DoubleBox(override val asDouble: Double) : DoubleWrapper<DoubleBox> {
    override fun fromDouble(d: Double) = DoubleBox(d)
}