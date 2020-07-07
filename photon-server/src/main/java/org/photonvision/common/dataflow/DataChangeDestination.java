/*
 * Copyright (C) 2020 Photon Vision.
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

package org.photonvision.common.dataflow;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public enum DataChangeDestination {
    DCD_ACTIVEMODULE,
    DCD_ACTIVEPIPELINESETTINGS,
    DCD_GENSETTINGS,
    DCD_UI,
    DCD_OTHER;

    public static final List<DataChangeDestination> AllDestinations =
            Arrays.asList(DataChangeDestination.values());

    public static class DataChangeDestinationList extends ArrayList<DataChangeDestination> {}
}
