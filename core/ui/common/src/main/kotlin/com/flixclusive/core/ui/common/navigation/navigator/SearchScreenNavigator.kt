package com.flixclusive.core.ui.common.navigation.navigator

import com.flixclusive.model.tmdb.Genre
import com.flixclusive.model.tmdb.category.Category

interface SearchScreenNavigator {
    fun openSearchExpandedScreen()

    fun openSeeAllScreen(item: Category)

    fun openGenreScreen(genre: Genre)
}