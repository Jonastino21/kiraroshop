/** @type {import('tailwindcss').Config} */
module.exports = {
  content: ["src/index.html", "src/components/login/login.html", "src/components/products/products.html"],
  theme: {
    extend: {},
  },
  plugins: [
    require('@tailwindcss/aspect-ratio'),
  ],
}
