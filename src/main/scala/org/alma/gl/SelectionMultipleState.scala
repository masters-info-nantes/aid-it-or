package org.alma.gl

/**
 * Created on 24/11/14.
 *
 * @author dralagen
 */
class SelectionMultipleState(ws:Workspace, beginCursor:Int, endCursor:Int) extends Selection {

  start = beginCursor
  end = endCursor
  buffer = ws
}