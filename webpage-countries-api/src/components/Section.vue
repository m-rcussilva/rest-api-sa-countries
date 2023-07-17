<script setup></script>

<template>
    <section class="section">
        <h1>
            <span class="text-top" style="display: block"
                >Países da América do Sul:</span
            >
            <span class="text-bottom">Capital, População e Área</span>
        </h1>
    </section>
</template>

<style scoped>
.section {
    padding: 8rem 0;
}

h1 {
    font-size: 4em;
    font-family: "Cabin Condensed", sans-serif;
    font-weight: 600;
    color: #7a82e4;
    line-height: 1.2;
}

h1 .text-top {
    background-image: linear-gradient(to right, #fff, #9a6aff);
    background-clip: text;
    -webkit-background-clip: text;
    -webkit-text-fill-color: transparent;
}

h1 .text-bottom {
    background-image: linear-gradient(to right, #e0d2ff, #9a6aff);
    background-clip: text;
    -webkit-background-clip: text;
    -webkit-text-fill-color: transparent;
}
</style>
