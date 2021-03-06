package consolecanvas.editor.commands

import consolecanvas.canvas.Canvas2D
import consolecanvas.canvas.CanvasData

/**
 * The command clears a canvas.
 */
data class ClearCommand(val canvas: Canvas2D) : UndoableCommand {
    private lateinit var savedCanvas: CanvasData

    override fun execute() {
        savedCanvas = canvas.getData()
        canvas.clear()
    }

    override fun undo() {
        canvas.setData(savedCanvas)
    }
}
