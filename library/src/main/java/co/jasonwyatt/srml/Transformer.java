package co.jasonwyatt.srml;

import android.content.Context;

/**
 * Defines an object which is capable of transforming a given SRML-marked-up String into a
 * styled/spanned CharSequence according to the tags used in the string.
 * Created by jason on 10/31/16.
 */
public interface Transformer {
    CharSequence transform(Context context, String srmlString);

    Sanitizer getSanitizer();
}
