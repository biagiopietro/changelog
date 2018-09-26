package com.michaelflisar.changelog.tags;

import android.content.Context;

import com.michaelflisar.changelog.R;

/**
 * Created by flisar on 07.03.2018.
 */

public class ChangelogTagProVersion implements IChangelogTag {

    @Override
    public String getXMLTagName() {
        return "proversion";
    }

    @Override
    public String formatChangelogRow(Context context, String changeText) {
        String  prefix = context.getResources().getString(R.string.changelog_pro_version);
        prefix = prefix.replaceAll("\\[", "<").replaceAll("\\]", ">");
        return prefix + changeText;
    }
}
