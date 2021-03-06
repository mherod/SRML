package co.jasonwyatt.srml.tags;

import android.content.Context;
import android.text.Spannable;
import android.text.Spanned;
import android.text.style.TypefaceSpan;

/**
 * @author jason
 *
 * Shows monospace text like source code.
 */
class Code extends Tag {
    static final String NAME = "code";
    private static final String MONOSPACE = "monospace";

    public Code(String tagStr, int taggedTextStart) {
        super(tagStr, taggedTextStart);
    }

    @Override
    public boolean matchesClosingTag(String tagName) {
        return NAME.equalsIgnoreCase(tagName);
    }

    @Override
    public void operate(Context context, Spannable builder, int taggedTextEnd) {
        builder.setSpan(new TypefaceSpan(MONOSPACE), getTaggedTextStart(), taggedTextEnd, Spanned.SPAN_INCLUSIVE_EXCLUSIVE);
    }
}
