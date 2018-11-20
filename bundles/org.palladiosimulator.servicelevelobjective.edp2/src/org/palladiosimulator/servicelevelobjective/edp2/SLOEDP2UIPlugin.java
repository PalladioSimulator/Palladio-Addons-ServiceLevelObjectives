package org.palladiosimulator.servicelevelobjective.edp2;

import org.eclipse.ui.plugin.AbstractUIPlugin;

public class SLOEDP2UIPlugin extends AbstractUIPlugin {
    /** The plug-in ID. */
    public static final String PLUGIN_ID = "org.palladiosimulator.servicelevelobjective.edp2";

    /** Instance of this plugin. */
    public static SLOEDP2UIPlugin INSTANCE;

    /**
     * Constructor.
     */
    public SLOEDP2UIPlugin() {
        super();

        // initialize
        INSTANCE = this;
    }
}
