/*
 * Copyright (C) 2007 The Android Open Source Project
 *
 * Licensed under the Eclipse Public License, Version 1.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.eclipse.org/org/documents/epl-v10.php
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.android.ide.eclipse.editors.manifest;

import com.android.ide.eclipse.editors.AndroidContentAssist;
import com.android.ide.eclipse.editors.descriptors.ElementDescriptor;
import com.android.ide.eclipse.editors.manifest.descriptors.AndroidManifestDescriptors;

/**
 * Content Assist Processor for AndroidManifest.xml
 */
final class ManifestContentAssist extends AndroidContentAssist {

    /**
     * Constructor for ManifestContentAssist 
     */
    public ManifestContentAssist() {
        super(new ElementDescriptor[] { AndroidManifestDescriptors.MANIFEST_ELEMENT });
    }
}
