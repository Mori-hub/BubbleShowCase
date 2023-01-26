package com.src.tools.bubbleshowcase

/**
 * Developed by Mori on 2023 New Year.
 */
interface OnBubbleMessageViewListener {
    /**
     * It is called when a user clicks the close action image in the BubbleMessageView
     */
    fun onCloseActionImageClick()


    /**
     * It is called when a user clicks the BubbleMessageView
     */
    fun onBubbleClick()
}