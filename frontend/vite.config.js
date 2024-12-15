import { defineConfig } from 'vite'
import react from '@vitejs/plugin-react-swc'

// https://vite.dev/config/
export default defineConfig({
  plugins: [react()],
  server: {
    host: true, // Enables access from external devices
    port: 5173, // Optional: Customize if needed
    watch: {
      usePolling: true, // Ensures file changes are detected in Docker
    },
  },
})
