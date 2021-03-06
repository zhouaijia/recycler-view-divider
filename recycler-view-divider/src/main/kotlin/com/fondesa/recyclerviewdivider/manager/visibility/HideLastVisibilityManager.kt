/*
 * Copyright (c) 2020 Giorgio Antonioli
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

@file:Suppress("DEPRECATION", "OverridingDeprecatedMember")

package com.fondesa.recyclerviewdivider.manager.visibility

/**
 * Default implementation of [VisibilityManager] that will show all dividers
 * excluding the one after the last group.
 */
@Deprecated("Use the new divider API instead.")
class HideLastVisibilityManager : VisibilityManager {

    override fun itemVisibility(
        groupCount: Int,
        groupIndex: Int
    ): VisibilityManager.VisibilityType = if (groupIndex == groupCount - 1) {
        VisibilityManager.VisibilityType.ITEMS_ONLY
    } else {
        VisibilityManager.VisibilityType.ALL
    }
}
