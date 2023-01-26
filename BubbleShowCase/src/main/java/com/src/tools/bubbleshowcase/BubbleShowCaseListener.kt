package com.src.tools.bubbleshowcase

/**
 * Developed by Mori on 2023 New Year.
 *
 * Listener of user actions in a BubbleShowCase
 */
interface BubbleShowCaseListener {
    /**
     * It is called when the user clicks on the targetView
     */
    fun onTargetClick(bubbleShowCase: BubbleShowCase)

    /**
     * It is called when the user clicks on the close icon
     */
    fun onCloseActionImageClick(bubbleShowCase: BubbleShowCase)

    /**
     * It is called when the user clicks on the background dim
     */
    fun onBackgroundDimClick(bubbleShowCase: BubbleShowCase)

    /**
     * It is called when the user clicks on the bubble
     */
    fun onBubbleClick(bubbleShowCase: BubbleShowCase)
}