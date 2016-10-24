package reftree.demo

import reftree.core.ToRefTree
import reftree.diagram.Diagram
import reftree.render.Renderer

object Shortcuts {
  val renderer = Renderer()

  def render[A: ToRefTree](value: sourcecode.Text[A]) =
    renderer.render("diagram", Diagram(value))

  def render[A: ToRefTree, B: ToRefTree](
    value1: sourcecode.Text[A],
    value2: sourcecode.Text[B]
  ) = renderer.render("diagram", Diagram(value1, value2))

  def render[A: ToRefTree, B: ToRefTree, C: ToRefTree](
    value1: sourcecode.Text[A],
    value2: sourcecode.Text[B],
    value3: sourcecode.Text[C]
  ) = renderer.render("diagram", Diagram(value1, value2, value3))
}
