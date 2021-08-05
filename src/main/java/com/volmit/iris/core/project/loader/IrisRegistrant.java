/*
 * Iris is a World Generator for Minecraft Bukkit Servers
 * Copyright (c) 2021 Arcane Arts (Volmit Software)
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <https://www.gnu.org/licenses/>.
 */

package com.volmit.iris.core.project.loader;

import com.volmit.iris.Iris;
import lombok.Data;

import java.awt.*;
import java.io.File;

@Data
public abstract class IrisRegistrant {
    private transient IrisData loader;

    private transient String loadKey;

    private transient File loadFile;

    public abstract String getFolderName();

    public abstract String getTypeName();

    public File openInVSCode() {
        try {
            Desktop.getDesktop().open(getLoadFile());
        } catch (Throwable e) {
            Iris.reportError(e);
        }

        return getLoadFile();
    }
}
