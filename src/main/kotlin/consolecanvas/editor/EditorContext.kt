package consolecanvas.editor

import consolecanvas.canvas.Canvas2D
import consolecanvas.editor.commands.UndoableCommand
import java.util.*

class EditorContext(
        var activeCanvas: Canvas2D = Canvas2D(0, 0),
        val commandHistory: Stack<UndoableCommand> = Stack()
)
