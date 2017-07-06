package com.fstyle.java_design_pattern.structural.bridge

/**
 * Created by framgia on 06/07/2017.
 */
abstract class Shape(protected val color: Color) {
  abstract fun applyColor()
}
