package Names

import android.util.Log

class callOutMyName() : myName() {
    override var firstName: String= "Alex"
    override var secondName: String = "Nduta"
    override fun shoutMyName() {
        Log.i("MYTAG", " Me shouting: my name is ${firstName + secondName}")
    }

    override fun whispherMyName() {
        Log.i("MYTAG", "Me whisphering:my name is ${firstName + secondName}")
    }
}