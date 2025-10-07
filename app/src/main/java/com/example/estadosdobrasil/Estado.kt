package com.example.estadosdobrasil

data class Estado(
    val nome: String,
    val bandeiraResId: Int,
    val capital: String,
    val populacao: String,
    val regiao: String
)

object EstadoData {
    fun getEstados(): List<Estado> { // Lista de Estados
        return listOf(
            Estado("Acre", R.drawable.acre, "Rio Branco", "830 mil", "Norte"),
            Estado("Alagoas", R.drawable.alagoas, "Maceió", "3,4 milhões", "Nordeste"),
            Estado("Amapá", R.drawable.amapa, "Macapá", "920 mil", "Norte"),
            Estado("Amazonas", R.drawable.amazonas, "Manaus", "4,1 milhões", "Norte"),
            Estado("Bahia", R.drawable.bahia, "Salvador", "14,8 milhões", "Nordeste"),
            Estado("Ceará", R.drawable.ceara, "Fortaleza", "9,2 milhões", "Nordeste"),
            Estado("Distrito Federal", R.drawable.distrito_federal, "Brasília", "3,1 milhões", "Centro-Oeste"),
            Estado("Espírito Santo", R.drawable.espirito_santo, "Vitória", "4,1 milhões", "Sudeste"),
            Estado("Goiás", R.drawable.goias, "Goiânia", "7,2 milhões", "Centro-Oeste"),
            Estado("Maranhão", R.drawable.maranhao, "São Luís", "7,0 milhões", "Nordeste"),
            Estado("Mato Grosso", R.drawable.mato_grosso, "Cuiabá", "3,6 milhões", "Centro-Oeste"),
            Estado("Mato Grosso do Sul", R.drawable.mato_grosso_sul, "Campo Grande", "2,8 milhões", "Centro-Oeste"),
            Estado("Minas Gerais", R.drawable.minas_gerais, "Belo Horizonte", "21,4 milhões", "Sudeste"),
            Estado("Pará", R.drawable.para, "Belém", "8,1 milhões", "Norte"),
            Estado("Paraíba", R.drawable.paraiba, "João Pessoa", "4,0 milhões", "Nordeste"),
            Estado("Paraná", R.drawable.parana, "Curitiba", "11,6 milhões", "Sul"),
            Estado("Pernambuco", R.drawable.pernambuco, "Recife", "9,7 milhões", "Nordeste"),
            Estado("Piauí", R.drawable.piaui, "Teresina", "3,3 milhões", "Nordeste"),
            Estado("Rio de Janeiro", R.drawable.rio_janeiro, "Rio de Janeiro", "17,2 milhões", "Sudeste"),
            Estado("Rio Grande do Norte", R.drawable.rio_grande_norte, "Natal", "3,5 milhões", "Nordeste"),
            Estado("Rio Grande do Sul", R.drawable.rio_grande_sul, "Porto Alegre", "11,3 milhões", "Sul"),
            Estado("Rondônia", R.drawable.rondonia, "Porto Velho", "1,8 milhão", "Norte"),
            Estado("Roraima", R.drawable.roraima, "Boa Vista", "650 mil", "Norte"),
            Estado("Santa Catarina", R.drawable.santa_catarina, "Florianópolis", "7,6 milhões", "Sul"),
            Estado("São Paulo", R.drawable.sao_paulo, "São Paulo", "44,4 milhões", "Sudeste"),
            Estado("Sergipe", R.drawable.sergipe, "Aracaju", "2,3 milhões", "Nordeste"),
            Estado("Tocantins", R.drawable.tocantins, "Palmas", "1,6 milhão", "Norte")
        )
    }
}