import java.awt.EventQueue
import java.awt.Graphics
import java.awt.Graphics2D
import java.awt.event.KeyEvent
import java.awt.event.KeyListener
import java.awt.geom.Ellipse2D
import java.awt.geom.Rectangle2D
import javax.swing.JFrame


class KotlinSwingSimpleEx(title: String) : JFrame() {

    init {
        createUI(title)
    }

    private fun createUI(title: String) {
        setTitle(title)
        defaultCloseOperation = EXIT_ON_CLOSE
        setSize(1920, 1080)
        setLocationRelativeTo(null)
    }

    override fun paint(g: Graphics?) {
        super.paint(g)
        val graphics: Graphics2D = g as Graphics2D

        g.draw(Rectangle2D.Double(50.0, 50.0, 50.0, 50.0))
    }
}

private fun createAndShowGUI() {
    val frame = KotlinSwingSimpleEx("Simple")
    frame.isVisible = true
}

fun main() {
    EventQueue.invokeLater(::createAndShowGUI)
}


