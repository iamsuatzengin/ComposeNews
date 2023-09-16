@file:Suppress("ImportOrdering")

package ir.composenews.data.repository.mapper

import org.junit.Assert.assertEquals
import org.junit.Test
import ir.composenews.domain.test.notFavoriteMarket
import ir.composenews.data.mapper.toLocalMarketDto
import ir.composenews.data.mapper.toMarket
import ir.composenews.localdatasource.test.localMarketDto

class LocalMarketDtoMapperTest {

    @Test
    fun localMarketDtoToNews() {
        val mappedMarket = localMarketDto.toMarket()
        assertEquals(mappedMarket, notFavoriteMarket)
    }

    @Test
    fun newsToLocalNewsDto() {
        val mappedLocalNews = notFavoriteMarket.toLocalMarketDto()
        assertEquals(mappedLocalNews, localMarketDto)
    }
}