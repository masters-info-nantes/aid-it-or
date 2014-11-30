package org.alma.gl.command

import org.alma.gl.{Clipboard, Selection}

/**
 * Created on 24/11/14.
 *
 * @author dralagen
 */
class Delete(s: Selection) extends Command(s:Selection) {
    override def execute={
        selection.delete()
    }
}
