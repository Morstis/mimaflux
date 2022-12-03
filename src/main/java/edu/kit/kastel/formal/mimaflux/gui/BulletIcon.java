/*
 * This file is part of the tool MimaFlux.
 * https://github.com/mattulbrich/mimaflux
 *
 * MimaFlux is a time travel debugger for the Minimal Machine
 * used in Informatics teaching at a number of schools.
 *
 * The system is protected by the GNU General Public License Version 3.
 * See the file LICENSE in the main directory of the project.
 *
 * (c) 2016-2022 Karlsruhe Institute of Technology
 *
 * Adapted for Mima by Mattias Ulbrich
 */
package edu.kit.kastel.formal.mimaflux.gui;

import javax.swing.*;
import java.awt.*;

public class BulletIcon implements Icon {

    public static final int SIZE = 12;
    public static final Color COLOR = new Color(0xD44903);

    @Override
    public void paintIcon(Component c, Graphics g, int x, int y) {
        g.setColor(COLOR);
        g.fillOval(x, y, SIZE, SIZE);
    }

    @Override
    public int getIconWidth() {
        return SIZE;
    }

    @Override
    public int getIconHeight() {
        return SIZE;
    }
}
