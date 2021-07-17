package com.dooboolab.TauEngine;
/*
 * Copyright 2018, 2019, 2020 Dooboolab.
 *
 * This file is part of the Tau project.
 *
 * Tau is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License version 3 (LGPL-V3), as published by
 * the Free Software Foundation.
 *
 * Tau is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with the Tau project.  If not, see <https://www.gnu.org/licenses/>.
 */

import com.dooboolab.TauEngine.Flauto.*;

public interface FlautoRecorderCallback
{
        public abstract void openRecorderCompleted(boolean success);
        public abstract void closeRecorderCompleted(boolean success);
        public abstract void startRecorderCompleted(boolean success);
        public abstract void stopRecorderCompleted(boolean success, String url);
        public abstract void pauseRecorderCompleted(boolean success);
        public abstract void resumeRecorderCompleted(boolean success);
        public abstract void updateRecorderProgressDbPeakLevel(double normalizedPeakLevel, long duration);
        public abstract void recordingData ( byte[] data);
        abstract public void log(t_LOG_LEVEL level, String msg);

}