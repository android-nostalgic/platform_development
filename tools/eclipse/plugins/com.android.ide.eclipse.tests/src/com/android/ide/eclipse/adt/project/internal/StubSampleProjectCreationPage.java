/*
 * Copyright (C) 20078The Android Open Source Project
 * 
 * Licensed under the Eclipse Public License, Version 1.0 (the "License"); you
 * may not use this file except in compliance with the License. You may obtain a
 * copy of the License at
 * 
 * http://www.eclipse.org/org/documents/epl-v10.php
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package com.android.ide.eclipse.adt.project.internal;

import com.android.ide.eclipse.adt.project.internal.NewProjectCreationPage;

import java.io.File;

/**
 * Stub class for project creation page Returns canned responses for creating a
 * sample project
 */
public class StubSampleProjectCreationPage extends NewProjectCreationPage {

    private String mSampleProjectName;
    private String mOsSdkLocation;

    public StubSampleProjectCreationPage(String pageName,
            String sampleProjectName, String osSdkLocation) {
        super(pageName);
        this.mSampleProjectName = sampleProjectName;
        this.mOsSdkLocation = osSdkLocation;
    }

    @Override
    public String getProjectName() {
        return mSampleProjectName;
    }

    @Override
    public String getPackageName() {
        return "com.android.samples";
    }

    @Override
    public String getActivityName() {
        return mSampleProjectName;
    }

    @Override
    public String getApplicationName() {
        return mSampleProjectName;
    }

    @Override
    public boolean isNewProject() {
        return false;
    }

    @Override
    public String getProjectLocation() {
        return mOsSdkLocation + File.separator + "samples" + File.separator + mSampleProjectName;
    }

    @Override
    public String getSourceFolder() {
        return "src";
    }

}
