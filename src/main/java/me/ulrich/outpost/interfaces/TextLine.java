package me.ulrich.outpost.interfaces;

public interface TextLine extends Line {

    /**
     * Get the {@link String} that the {@link TextLine} currently represents
     * @return The current displayed {@link String}
     */
    String getText();

    /**
     * Set the {@link String} the {@link TextLine} displays
     * @param text The {@link String} to display
     */
    void setText(final String text);

}

