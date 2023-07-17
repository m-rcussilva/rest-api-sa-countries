const COUNTRY_API_BASE_URL = "http://localhost:8080/api/countries"

class CountryService {
    async getCountries() {
        try {
            const response = await fetch(COUNTRY_API_BASE_URL)
            if (!response.ok) {
                throw new Error(
                    "Erro ao obter os dados dos países da América do Sul."
                )
            }

            const data = await response.json()
            return data
        } catch (error) {
            console.log("Ocorreu um erro.")
            throw error
        }
    }
}

export default new CountryService()
