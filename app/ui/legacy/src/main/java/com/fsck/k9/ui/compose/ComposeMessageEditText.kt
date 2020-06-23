package com.fsck.k9.ui.compose

import android.content.Context
import android.util.AttributeSet
import androidx.core.text.HtmlCompat
import com.fsck.k9.message.html.HtmlConverter
import org.wordpress.aztec.AztecText
import timber.log.Timber

open class ComposeMessageEditText : AztecText {

    constructor(context: Context) : super(context)

    constructor(context: Context, attrs: AttributeSet) : super(context, attrs)

    constructor(context: Context, attrs: AttributeSet, defStyleAttr: Int) : super(context, attrs, defStyleAttr)

    open fun getCharacters(): String? {
//        Timber.d(HtmlConverter.textToHtmlFragment(HtmlCompat.toHtml(text, HtmlCompat.TO_HTML_PARAGRAPH_LINES_INDIVIDUAL)))
//
//        return HtmlConverter.textToHtmlFragment(HtmlCompat.toHtml(text, HtmlCompat.TO_HTML_PARAGRAPH_LINES_INDIVIDUAL))
//            .replace("&gt;", ">")
//            .replace("&lt;", "<")
//            .replace("&nbsp;", " ")
//            .replace("&amp;", "&")
        Timber.d("getCharacters " + toHtml(false))
        return toHtml(false)
    }

    open fun setCharacters(html: CharSequence) {
        fromHtml(html.toString(), true)
//        setText(HtmlCompat.fromHtml(html.toString(), HtmlCompat.FROM_HTML_MODE_COMPACT))
    }
}
