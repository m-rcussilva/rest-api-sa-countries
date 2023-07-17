<script setup>
import { ref, onMounted } from "vue"
import CountryService from "../services/CountryService"

const countries = ref([])

const getCountries = async () => {
    try {
        const response = await CountryService.getCountries()
        countries.value = response
    } catch (error) {
        console.error("Ocorreu um erro.", error)
    }
}

onMounted(getCountries)
</script>

<template>
    <main>
        <table>
            <thead>
                <tr>
                    <th>País</th>
                    <th>Capital</th>
                    <th>População</th>
                    <th>Área km²</th>
                </tr>
            </thead>
            <tbody>
                <tr v-for="country in countries">
                    <td>{{ country.name }}</td>
                    <td>{{ country.capital }}</td>
                    <td>{{ country.population }}</td>
                    <td>{{ country.area }}</td>
                </tr>
            </tbody>
        </table>
    </main>
</template>

<style scoped>
table {
    width: 100%;
    border-collapse: collapse;
    border-spacing: 0;
}

th {
    background-color: #7a82e4;
    font-weight: bold;
}

tbody {
    background-color: #e3e3e3;
}

th,
td {
    padding: 8px;
    text-align: left;
    border-bottom: 1px solid #ddd;
}
</style>
