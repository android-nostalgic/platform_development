/*
 * Copyright (C) 2008 The Android Open Source Project
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

package com.android.ide.eclipse.editors.xml;

import com.android.ide.eclipse.editors.AndroidContentAssist;
import com.android.ide.eclipse.editors.xml.descriptors.XmlDescriptors;

/**
 * Content Assist Processor for /res/xml XML files
 */
class XmlContentAssist extends AndroidContentAssist {

    /**
     * Constructor for LayoutContentAssist 
     */
    public XmlContentAssist() {
        super(XmlDescriptors.getInstance().getDescriptor().getChildren());
    }
}
