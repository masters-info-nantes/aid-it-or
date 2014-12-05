package org.alma.gl

/**
 * Created on 24/11/14.
 *
 * @author dralagen, thecreator
 */
class SelectionMultipleStrategy(ws:Workspace, beginCursor:Int, endCursor:Int) extends Selection {

  start = {
    if (beginCursor < 0) {
      0
    } else if (beginCursor > ws.getContent().length()) {
      ws.getContent().length()
    } else {
      beginCursor
    }
  }
  end = {
    if (endCursor < start) {
      start
    } else if (endCursor > ws.getContent().length()) {
      ws.getContent().length()
    } else {
      endCursor
    }
  }
  buffer = ws

  override def delete(): String = {
      val deleteText = getContent
      write(new Clipboard(""))
      deleteText
  }

  override def read: Clipboard = {
    new Clipboard(buffer.getContent().substring(start, end))
  }

  override def cut(): Clipboard = {
    val clip:Clipboard = read
    delete()
    clip
  }
}