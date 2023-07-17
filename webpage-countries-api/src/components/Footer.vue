<script setup></script>

<template>
    <footer>
        <p>
            <span class="name">Marcus Silva</span><span> - </span>
            <a href="https://marcussilva.netlify.app/" target="_blank"
                >Portfolio
            </a>
            <span> - </span>
            <a href="https://github.com/m-rcussilva" target="_blank">Github</a>
        </p>
    </footer>
</template>

<style scoped>
footer {
    padding-top: 5em;
    padding-bottom: 2em;
    display: flex;
    place-content: center;
}

footer .name {
    color: var(--dark-text-color);
}

footer p a {
    color: var(--link-color);
}

footer span {
    color: var(--background-color);
}
</style>
